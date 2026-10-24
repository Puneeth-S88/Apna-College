import java.util.*;
public class revArray{
public static void revArray(int numbers[]){
int start=0;
int last=numbers.length-1;


while(start<last){
int temp=numbers[last];
numbers[last]=numbers[start];
numbers[start]=temp;

start++;
last--;
}
}

public static void main(String[] args){
int numbers [] ={3,4,5,6,7,8};
revArray(numbers);

for(int i=0;i<numbers.length;i++){
System.out.print(numbers[i] + " ");
}
}
}