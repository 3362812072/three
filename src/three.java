public class three {
    public static void main(String[] args) {
        int count = 0,i;
        boolean flag;
        for(i = 101;i<201;i++){
            flag = true;
            for (int x = 2;x < i; x++){
                if (i % x==0){
                    flag = false;
                    break;
                }
            }
            if (flag ==true){
                System.out.printf("%d\t",i);
            }
        }
    }
}
