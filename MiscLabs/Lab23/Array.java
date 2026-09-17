public class Array{
    int[][]nums = new int[10][10];
    public void Array1(){
        for(int r = 0;r < 10;r++){
            for(int c = 0;c < 10;c++){
                nums[r][c] = (int)(Math.random()*99+1);
            }
        }
    }
    public int Largest(){
        int Largest = 0;
        for(int r = 0;r < 10;r++){
            for(int c = 0;c < 10;c++){
                if(nums[r][c]> Largest){
                    Largest = nums[r][c];
                }
            }
        }
        return Largest;
    }
    public double highestAverage(){
        int highestRow= -1;
        double highestAverage = 0;
        double total =0;
        for(int r = 0;r < 10;r++){
            total=0;
            for(int c = 0;c < 10;c++){
                total +=nums[r][c];
            }
            if((total/10)>=highestAverage){
                highestAverage=total/10;
                highestRow =r;
            }
        }
        return highestRow;
    }
    public int highestOdds(){
        int mostOdds= 0;
        int totalOdds = 0;
        int columnOdds = 0;
        for(int c = 0;c < 10;c++){
            totalOdds=0;
            for(int r = 0;r < 10;r++){
                if(nums[r][c]%2 != 0){
                    totalOdds++;
                }
            }
            if(totalOdds >= mostOdds){
                mostOdds = totalOdds;
                columnOdds = c;
            }
        }
        return columnOdds;
    }
    public int MostVal(){
        int val= 0;
        int mostVal = 0;
        for(int g = 1;g< 100;g++){
            int count = 0;
            for(int r = 0;r < 10;r++){
                for(int c = 0;c < 10;c++){
                    if(g == nums[r][c]){
                        count++;
                    }
                }
            }
            if(count>mostVal){
                mostVal=g;
            }
        }
        return mostVal;
    }
    public int NumOfVal(int x){
        int count = 0;
        for(int r = 0;r < 10;r++){
            for(int c = 0;c < 10;c++){
                if(x == nums[r][c]){
                    count++;
                }
            }
        }
        return count;
    }
}
