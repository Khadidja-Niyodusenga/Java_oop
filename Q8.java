package assignement;
public class Q8 {
    public static void matrices(){
        int result;
    int mOne[][]={{1,1,1},{2,2,2}};
    int mTwo[][]={{3,3,3},{4,4,4}};
    for(int i=1;i<mOne.length;i++){
        for(int j=i;j<mTwo.length;j++){
//        sum[i][j]=mOne[i][j]+mTwo[i][j];
System.out.println(mOne[i][j]+" "+mTwo[i][j]);}
System.out.println("");
        }
      for(int i=1;i<mOne.length;i++){
        for(int j=1;j<mTwo.length;j++)
        {
//System.out.println(mOne[i][j]"+"mTwo[i][j]+"="+mOne[i][j]+mTwo[i][j]);
        }
System.out.println();
        }
    }
    
    public static void main(String[] args) {
        matrices();
    }
}
