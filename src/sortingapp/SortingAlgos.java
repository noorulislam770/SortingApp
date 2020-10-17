package sortingapp;

public class SortingAlgos 
{
    private int bSwap;
    private int bComp;
    
    void SortingAlgos()
    {
        bSwap = 0;
        bComp = 0;
    }
    
    public void BubbleSort(int bList[])
    {
        
        //Implement Bubble Sort Algorithm Here
        System.out.println("BUBBLE SORT IS NOT YET IMPLEMENTED");
        
        
        int current = 0;
        int next = current + 1;
        
        while (true){
            if (bList[current] > bList[next] ){
                bList[next] = bList[current];
                bList[current] = bList[next];
                current  = next;
                next ++;
            }
            
            else {
                
            }
        }
    
    
    }
    
    public void PrintList(int List[])
    {
        for(int i=0; i<List.length; i++)
        {
            System.out.print(List[i]+" ");
        }
        
    }
    
    public void PrintReport()
    {
        System.out.println("----------------------------------");
        System.out.println("\t Comparison Chart");
        System.out.println("----------------------------------");
        System.out.println("Bubble Sort Comparisons    : "+bComp);
        System.out.println("Bubble Swaps Swaps         : "+bSwap);
        
    }
    
}
