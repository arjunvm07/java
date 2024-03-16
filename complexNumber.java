public class complexNumber{
double real;
double img;
complexNumber(double r,double i){
this.real=r;
this.img=i;
}
complexNumber(){}
complexNumber sum(complexNumber c1,complexNumber c2){
complexNumber temp=new complexNumber();
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
public static void main(String [] args){
complexNumber c1=new complexNumber(2.3,5.2);
complexNumber c2=new complexNumber(3.2,3.5);
complexNumber temp1=new complexNumber();
temp1=temp1.sum(c1,c2);
System.out.println("sum:"+temp1.real+"+i"+temp1.img);
}
}

