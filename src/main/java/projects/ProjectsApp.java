package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

public class ProjectsApp {

	public ProjectsApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnection.getConnection();
		
	}

}
