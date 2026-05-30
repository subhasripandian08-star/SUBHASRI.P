public class missing {
    public static void main(String[] args){
       
  int arr[] = {1, 2, 4, 5};

        for(int i = 1; i <= 5; i++) {

            boolean found = false;

            for(int j = 0; j < arr.length; j++) {

                if(i == arr[j]) {
                    found = true;
                }
            }

            if(found == false) {
                System.out.println(i);
            }
        }
    }
}

