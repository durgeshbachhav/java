public class LinearSearch{
     public static int linear(int numbers[],int key) {
          for(int i=0;i<numbers.length;i++){
               if(numbers[i]==key){
                    return i;
               }
          }
          return -1;
     }

     public static Boolean MenuList(String menu[], String key){
          for(int i=0;i<menu.length;i++){
               if(menu[i].equals(key)){
                    return true;
               }

          }
          return false;
     }
     public static void main(String[] args) {
          // example 1
          // int number[]={2,4,5,6,7,810,13,24};
          // int index = linear(number, 810);
          // System.out.println(index);
          // if(index == -1){
          //      System.out.println("the number is not found in given array");
          // } else {
          //      System.out.println("the key found at index : "+index);
          // }

          // example 2
          // String Menu[] = {"samosa","dosa","pizza","burger","sandwitch","pavbhaji","panipuri"};
          // String key = "sandwitch";
          // boolean myburger = MenuList(Menu, key);
          // if(myburger == true){
          //      System.out.println(key+ " is available in menu");
          // } else {
          //      System.out.println("not found!");
          // }
     }
}