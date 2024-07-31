package Strings;
//                           N
/*                           |
                             |
*                            |
*                            |
*           W----------------|------------------E 
*                            |
*                            |
*                            |
*                            |
                             S
                             */
public class ShortestPath {
    static int shortestDist(String str)
    {
        int x=0,y=0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp=='N')
            {
                y++;
            } else if (temp == 'S') {
                y--;
            } else if (temp == 'E') {
                x++;
            }
            else
            {
                x--;
            }
        }
        int dist = (0-x)*(0-x)+(0-y)*(0-y);
        return (int) Math.sqrt(dist);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestDist(str));
    }
}
