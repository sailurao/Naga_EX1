public class TestAscnd {
    public static int MyArray[]={2,3,1,9,8,7,5};
    public static int MyArrIndex[];
    public static int GetSmallestVal(){
        int i;
        int sn=MyArray[0];
        int sn_indx=0;
        for(i=0;i<MyArray.length;i++){
            if(MyArray[i]<sn){
               sn=MyArray[i];
               sn_indx=i;
            }
        }
        MyArrIndex = new int[1];
        MyArrIndex[0]=sn_indx;
        return sn;
    }

    public static int[] AddArray(int[] arr, int nu){
        int[] arr1=new int[arr.length+1];
        int i;
        for(i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        arr1[i]=nu;
        return arr1;
    }

    public static boolean IstheIndxUsed(int indx){
        if(MyArrIndex.length==0)
            return false; //not used
        int i;
        for(i=0;i<MyArrIndex.length;i++){
            if(MyArrIndex[i]==indx)
                return true; //yes index used
        }
        return false;
    }

    public static int GetNxtSmallestVal(){
        int i;
        int sn=MyArray[0];
        int sn_indx=0;
        boolean bGetRef=true;
        for(i=0;i<MyArray.length;i++){

            if(IstheIndxUsed(i)){
                continue;
            }
            if(bGetRef){
                bGetRef=false;
                sn=MyArray[i];
                sn_indx=i;
            }

            if(MyArray[i]<sn){
                sn=MyArray[i];
                sn_indx=i;
            }
        }

        MyArrIndex=AddArray(MyArrIndex,sn_indx);
        return sn;
    }

    public static void main(String[] argc) {
        int sn;
        System.out.println("OM SRI RAM");
        System.out.println("****** ASCENDING ORDER EXAMPLE *********");
        sn = GetSmallestVal();
        System.out.println(sn);
        int i;
        for (i = 1; i < MyArray.length; i++) {
            sn=GetNxtSmallestVal();
            System.out.println(sn);
        }
    }
}
