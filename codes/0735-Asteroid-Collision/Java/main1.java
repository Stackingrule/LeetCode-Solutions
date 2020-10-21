class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length <= 1)return asteroids;
        int sta[] = new int[asteroids.length], size = 0;
        main: for(int x:asteroids){
            if(x<0){
                while(size>0 && sta[size-1] > 0){
                    int y = sta[size-1];
                    if(y <= -x)size--;
                    if(y >= -x)continue main;
                }
            }
            sta[size++]=x;
        }
        if(size==0)return new int[0];
        return Arrays.copyOfRange(sta, 0, size);
    }
}