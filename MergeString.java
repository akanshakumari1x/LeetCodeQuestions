public class MergeString {

    public static  void main(String ar[]){

        String s1 = "abc";
        String s2 = "pqrss";

        int first = 0;
        int second = 0;

        char [] ch = s1.toCharArray();
        char [] ch1 = s2.toCharArray();
        char [] temp = new char[ch.length+ch1.length];
       int x = 0;
               while(first<ch.length || second<ch1.length)
               {
               temp[x] = ch[first];
               x++;
               temp[x] = ch1[second];
               x++;
               first++;
               second++;
               }

               for(int j = 0; j<=temp.length-1; j++){
                   System.out.print( temp[j]);
               }



           }

       }

