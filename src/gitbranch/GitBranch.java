
package gitbranch;


public class GitBranch {

  
    public void main(String[] args) {
        GitBranch obj = new GitBranch();
        int i = obj.fv();
    }

    private int fv() {
        System.out.println("nem static fv");
        return 0;
    }
    
    public static void elj() {
        
    }
    
    
    
}
