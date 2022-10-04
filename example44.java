public class example44 {
    public static void main(String[] args)  {

        int testarray [] = {11367, 11358, 11421, 11530, 11491, 11218, 11789};

        for(int j=0; j < testarray.length ; j++) {
            for (int i = 0; i < testarray.length - j - 1;  i++) {
                int hold;
                hold = testarray[i + 1];
                int s2 = testarray[i];
                int s4 = testarray[i + 1];

                if (s4 > s2) {
                    testarray[i] =  s4;
                    testarray[i + 1] = s2;
                }
//            }
            }

        }
        for (int k : testarray){
            System.out.println("at end"+k);
        }
    }
}
