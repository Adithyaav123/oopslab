import java.io.*;
class area
{
int length;
int breadth;
int area;
void getdata()
{
length=100;
breadth=50;
}
void area1()
{
area=length*breadth;
System.out.println("area:"+area);
}
}
class Distance
{
public static void main(String args[])
{
area d=new area();
d.getdata();
d.area1();
}
}



