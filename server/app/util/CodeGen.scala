package util

object CodeGen extends App {
  slick.codegen.SourceCodeGenerator.run(
    "slick.jdbc.MySQLProfile", "com.mysql.cj.jdbc.Driver", 
    "jdbc:mysql://localhost/sales?user=gvirgen&password=password&nullNamePatternMatchesAll=true&serverTimezone=UTC", 
    "/home/mlewis/workspaceCourses/CSCI3345-S19/server/app/", 
    "models", Option("gvirgen"), Option("password"), true, false
  )
}