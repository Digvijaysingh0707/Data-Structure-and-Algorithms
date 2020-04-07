Sanju needs your help! He gets a list of employees with their salary. The maximum salary is 100.

Sanju is supposed to arrange the list in such a manner that the list is sorted in decreasing order of salary. And if two employees have the same salary, they should be arranged in lexicographical manner such that the list contains only names of those employees having salary greater than or equal to a given number x.

Help Sanju prepare the same!

Input Format
On the first line of the standard input, there is an integer x. The next line contans integer N, denoting the number of employees. N lines follow, which contain a string and an integer, denoting the name of the employee and his salary.

Constraints
1 <= N <= 10^5 1 <= | Length of the name | <= 100 1 <= x, salary <= 100

Output Format
You must print the required list.

Sample Input
79
4
Eve 78
Bob 99
Suzy 86
Alice 86
Sample Output
Bob 99
Alice 86
Suzy 86



package com.company;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Student {

    String name;
    int salary;

    public Student( String name,int salary) {
        this.salary = salary;
        this.name = name;
    }
}
class Checker implements Comparator<Student>{
    public int compare(Student a,Student b){
        if (a.salary==b.salary){
            return a.name.compareTo(b.name);
        }
        return ((Integer) b.salary).compareTo(a.salary);
    }
}
public class Main {

    //long start =System.currentTimeMillis();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int n = sc.nextInt();
        Student s[] = new Student[n];
        Checker c = new Checker();
        for (int i = 0; i < n; i++) {

            s[i] = new Student(sc.next(), sc.nextInt());
        }


        Arrays.sort(s, c);
        for (int i = 0; i < s.length-1; i++) {
            if (s[i].salary<limit||s[i].salary<0) {
                i++;
            }

            System.out.printf("%s %s\n", s[i].name, s[i].salary);
        }
    }
}
