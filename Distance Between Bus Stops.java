class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            int cwDistance = 0, ccwDistance = 0;
        
            if (start > destination) {
                int index = start;
                start = destination;
                destination = index;
            }
            
            //For clockwise direction
            for (int i = start; i < destination; i++) {
                cwDistance += distance[i];
            }
            
            //For counter-clockwise direction
            for (int i = destination; i < distance.length; i++) {
                ccwDistance += distance[i];
            }
            for (int i = 0; i < start; i++) {
                ccwDistance += distance[i];
            }
            
            if (cwDistance<ccwDistance)
                return cwDistance;
            else 
                return ccwDistance;
    }
}
