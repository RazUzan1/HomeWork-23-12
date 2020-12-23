package com.company;

import java.util.ArrayList;

    public class Student {
        String name;
        ArrayList<Integer> grades

        public Student(String name){
            this.name = name;
            ArrayList<Integer> grades = new ArrayList<Integer>();
        }
        //1
        public Double studentAverage(){
            double sum = 0;
            for (int i=0 ;i<grades.size();i++) {
                sum += grades.get(i);
            }
            return sum/grades.size();
        }
       //2
        public Boolean isTop(){
            if (studentAverage()>=90) {
                return true;
            } else {
                return false;
            }
        }

        //3
       
        public Student another(Student other){
            
           if (this.studentAverage() > other.studentAverage()) {
              return this;
            } else {
                return other;
            }
        }
       //4
        public ArrayList<Integer> Fail() {
            ArrayList<Integer> failed = new ArrayList<Integer>();
            for (int i=0; i<grades.size();i++) {
                if (grades.get(i)<55){
                    failed.add(grades.get(i));
                }
            }
            return failed;
        }
    }

