import java.util.*;;

public class Collections{
     public static void main(String[] args) {
          
          // String[] StudentName = new String[30];
          // StudentName[0] = "Rakesh";

          // StudentName[29] = "Harish";

          // StudentName[30] = "Raman";

          // ArrayList<String> StudentName = new ArrayList<>();
          // StudentName.add("Durgesh");
          // StudentName.add("aaaa");
          // StudentName.add("bbbb");
          // StudentName.add("ccc");
          // StudentName.add("dddd");
          // System.out.println(StudentName);

          List<Integer> list = new ArrayList();
          list.add(1);
          list.add(3);
          list.add(2);
          System.out.println(list);
          list.add(1,24);
          System.out.println(list);
          

          List<Integer> newList = new ArrayList();
          newList.add(12);
          newList.add(22);
          newList.add(33);
          list.addAll(2, newList);
          System.out.println(list);
          // System.out.println(list.get(4));
          // list.remove(Integer.valueOf(33));
          // System.out.println(list);
          // newList.clear();
          // System.out.println(newList);
          // list.set(2, 300);
          // System.out.println(list.contains(300));

          // for(int i=0;i<=list.size();i++){
          //      System.out.println("the element is :"+list.get(i));
          // }
          

          Iterator<Integer> iterator = newList.iterator();
          while(iterator.hasNext()){
               System.out.println("iterator : " + iterator.next());
          }
     }
}