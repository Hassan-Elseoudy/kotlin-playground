package interfaces

import classes.Course

interface CourseRepository {

    fun getById(id: Int): Course
}

class SQLCourseRepository: CourseRepository {

    override fun getById(id: Int): Course {
        return Course(id, "NAME", "AUTHOUR")
    }
}

class NoSQLCourseRepository: CourseRepository {

    override fun getById(id: Int): Course {
        return Course(id, "NAME", "AUTHOUR")
    }
}



fun main(){
    val repository: SQLCourseRepository = SQLCourseRepository()
    print(repository.getById(1))
}