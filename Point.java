package com.company;

import java.util.Scanner;

        public class Point {
            Double width;
            Double length;
            Scanner s = new Scanner(System.in);

            public Point(Double width, Double length) {
                this.width = width; //רוחב
                this.length = length; //אורך
            }

            //1
            public Point middle(Point p) {

                Point y = new Point(4.0, 7.0);
                Point x = new Point(s.nextDouble(), s.nextDouble());
                double width = (y.width + x.width) / 2;
                double length = (y.length + x.length) / 2;
                Point z = new Point(width, length);
                return z;
            }

            //2
            public Double distance(Point p) {
                Point y = new Point(4.0, 15.0);
                Point x = new Point(s.nextDouble(), s.nextDouble());
                return Math.sqrt(Math.pow((x.length - y.length), 2) + Math.pow((x.width - y.width), 2));
            }

            //3
            public Double areaSize(Point x, Point y) {
                Point z = new Point(s.nextDouble(), s.nextDouble());
                return (x.width * (y.length - z.length) + y.width * (z.length - x.length) + z.width * (x.length - y.length)) / 2;
            }


            //4
            public Double slope() {
                Point x = new Point(s.nextDouble(), s.nextDouble());
                return (x.length / x.width);
            }
        }











