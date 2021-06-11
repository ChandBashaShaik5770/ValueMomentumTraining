package com.vm.session.dao;

import com.vm.session.bean.Train;

public interface ITrainDAO
{

	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	public static final String URL="jdbc:mysql://localhost:3306/digital";
	public static final String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";

	
	
	Train findTrain(int trainNo);
	

}
