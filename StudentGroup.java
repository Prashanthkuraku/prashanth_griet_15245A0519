package main;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Date;
import java.lang.IllegalArgumentException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
    private Exception IllegalArgumentException;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		int i=0,n=students.length;
		for(i=0;i<n;i++)
		{System.out.println(students[i].id+" "+students[i].fullName+" "+students[i].birthDate+" "+students[i].avgMark+"\n");
		}
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	int i=0,n=students.length;
	if(n==0)
		throw new IllegalArgumentException();


	
	}

	@Override
	public Student getStudent(int index) {
	int i=index;
	System.out.println(students[i].id+" "+students[i].fullName+" "+students[i].birthDate+" "+students[i].avgMark+"\n");
		
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) 
	{
		// Add your implementation here
	
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
             
                
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
                int i=0,n=students.length;
                Student temp;
                for( i=0;i<n;i++)
                {
                    for(int j=1;j<n-1;j++)
                    {
                        if(students[j-1].id>students[j].id)
                        {
                            temp=students[j-1];
                            students[j-1]=students[i];
                            students[j]=temp;
                        }
                    }
                }
        }

	@Override
	public Student[] getByBirthDate(Date date) {
            
		// Add your implementation here
                int i,n=students.length;
                for(i=0;i<n;i++)
                {
                   if(date.equals(students[i].birthDate))
                       System.out.println(students[i].id+" "+students[i].fullName+" "+students[i].birthDate+" "+students[i].avgMark+"\n");
	                             
                }
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
                int i,n=students.length;
                for(i=0;i<n;i++)
                {
                   if(students[i].birthDate.after(firstDate) && students[i].birthDate.before(lastDate))
                       System.out.println(students[i].id+" "+students[i].fullName+" "+students[i].birthDate+" "+students[i].avgMark+"\n");
	                             
                }
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
                int i,n=students.length;
                Date today=new Date();
                long ltime=today.getTime()+days*24*60*60*1000;
                Date newday=new Date(ltime);
                for(i=0;i<n;i++)
                {
                   if(students[i].birthDate.after(date) && students[i].birthDate.before(newday))
                       System.out.println(students[i].id+" "+students[i].fullName+" "+students[i].birthDate+" "+students[i].avgMark+"\n");
	                            
                }
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
               
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
                int i,max=0,n=students.length;
                for(i=0;i<n;i++)
                {
                    if(students[i].avgMark>max)
                            max=(int) students[i].avgMark;
                }
                for(i=0;i<n;i++)
                {
                    if(students[i].avgMark==max)
                          System.out.println(students[i].id+" "+students[i].fullName+" "+students[i].birthDate+" "+students[i].avgMark+"\n");
                }
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
                int i,n=students.length;
                for(i=0;i<n;i++)
                {
                   if(students[i].id==student.id)
                       student.id=students[i+1].id;
	                             
                }
                System.out.println(student.id+" "+student.fullName+" "+student.birthDate+" "+student.avgMark+"\n");
	               
		
		return null;
	}
}
