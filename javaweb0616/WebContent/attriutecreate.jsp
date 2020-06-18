<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//Scala Data
	String scala = "1개만 저장이 가능한 데이터를 scala data 라고 합니다.";
	//Scala Data 의 배열
	String [] dbms = {"Oracle", "MySQL", "MongoDB"};
	
	//Map 
		java.util.Map <String, Object> map = new java.util.HashMap<>();
		map.put("overloading", "동일한 클래스에 매개변수의 개수나 자료형이 다른 형태의  메소드가 동일한 이름으로 2개 이상 존재하는 것");
		map.put("overriding", "상속관계에 있는 클래스에 동일한 원형의 메소드가 존재하는 것으로 하위 클래스에서 상위 클래스의 메소드에 기능을 추가하는 것");
		
		
		java.util.Map <String, Object> map1 = new java.util.HashMap<>();
		map1.put("name","programming Language");
		map1.put("subject","java");
		
		java.util.Map <String, Object> map2 = new java.util.HashMap<>();
		map2.put("name","Database");
		map2.put("subject","Oracle");
		
		java.util.Map <String, Object> map3 = new java.util.HashMap<>();
		map3.put("name","WebFrontEnd");
		map3.put("subject","HTML");
		
		java.util.List <java.util.Map<String, Object>> list = new java.util.ArrayList<>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		
	//request 객체에 데이터 저장
	request.setAttribute("scala", scala);
	request.setAttribute("dbms", dbms);
	request.setAttribute("map", map);
	request.setAttribute("list", list);
	
	//출력할 곳으로 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher("attributedisplay.jsp");
		dispatcher.forward(request, response);
	

%>


