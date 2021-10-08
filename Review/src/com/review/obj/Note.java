package com.review.obj;

public class Note {
	/*
	설계>
	1. 멤버 변수(private); 크기, 표지 색상, 페이지수, 소유자이름, 가격
	2. Setter/Getter
		>set크기 
			>유효성; A3~5, B3~5만 가능
			>switch문 크기별 가격추가 
			>가격 저장
		>set색상
			>유효성; 검정, 흰, 노란, 파랑
			>switch문 색상별 가격추가
			>색 저장
		>set페이지
			>유효성; 10~200
			>if문 페이지수별로 volume에 저장
			>10페이지 초과하면 페이지당 10원 추가
		>set이름
			>한글 2~5자 이내
	3. info
		>if문 소유자 이름이 있는지? 없으면 주인 없는 노트만 출력
	 */
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	private String volume;

	public void setSize(String size) {
		if(!(size.equals("A3") ||
				size.equals("A4") ||
				size.equals("A5") ||
				size.equals("B3") ||
				size.equals("B4") ||
				size.equals("B5"))){
			return;
		}
		
		switch(size) {
		case "A3" : this.price += 400; break;
		case "A4" : this.price += 200; break;
		case "B3" : this.price += 500; break;
		case "B4" : this.price += 300; break;
		case "B5" : this.price += 100; break;
		}
		
		this.size = size;
	}
	
	public void setColor(String color) {
		if(!(color.equals("검정색") ||
				color.equals("흰색") ||
				color.equals("노란색") ||
				color.equals("파란색"))) {
			return;
		}
		
		switch(color) {
		case "검정색" : this.price += 100; break;
		case "노란색" : this.price += 200; break;
		case "파란색" : this.price += 200; break;
		}
		
		this.color = color;
	}


	public void setPage(int page) {
		if(page < 10 || page > 200) {
			return;
		}
		
		if(page <= 50) {
			this.volume = "얇은";
		} else if(page <= 100) {
			this.volume = "보통";
		} else {
			this.volume = "두거운";
		}
		
		this.price += (page - 10) * 10;
		
		this.page = page;
	}
	
	public void setOwner(String owner) {
		if(owner.length() < 2 || owner.length() > 5 || (!isKorean(owner))) {
			return;
		}
		
		this.owner = owner;
	}

	private Boolean isKorean(String owner) {
		for(int i=0; i<owner.length(); i++) {
			if(owner.charAt(i) < '가' || owner.charAt(i) > '힣') {
				return false;
			}
		}
		
		return true;
	}
	
	public String info() {
		String temp = "■■■■■■ 노트 정보 ■■■■■■\n";
		if(this.owner == null) {
			temp += "주인 없는 노트\n";
		} else {
			temp += "소유자 : " + this.owner
					+ "\n특성 : " + this.color 
					+ " " + this.volume + " " + this.size + "노트"
					+ "\n가격 : " + this.price + "원";
		}
		
		temp += "\n■■■■■■■■■■■■■■■■■■■■■■";
		
		return temp;
	}
	

}
