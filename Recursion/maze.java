package Recursion;
//cb yt(3)
public class maze {
    public static void main(String[] args){

        Maze(0,0,2,2,"");

    }
    public static void Maze(int x, int y, int fx, int fy, String ans){

        if(x>fx || y>fy)
            return;
        else if(x==fx && y==fy){
            System.out.println(ans);
            return;
        }

        Maze(x+1, y, fx, fy, ans+"H");
        Maze(x, y+1, fx, fy, ans+"V");
        Maze(x+1,y+1,fx,fy,ans+"D");
    }
}
