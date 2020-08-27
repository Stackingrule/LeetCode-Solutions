class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<> ();
        if (tickets == null || tickets.size () == 0) {
            return result;
        }
        
        
        //1. Get departure vs destination map
        Map<String, List<String>> departureVsDestinationMap = new HashMap<> ();
        for (List<String> ticket : tickets) {
            String departure = ticket.get (0);
            String destination = ticket.get (1);
            
            List<String> dests = departureVsDestinationMap.getOrDefault (departure, new ArrayList<String> ());
            dests.add (destination);
            
            departureVsDestinationMap.put (departure, dests);
        }
        
        //2. Sort each of the destination list in Map
        for (Map.Entry <String, List<String>> entry : departureVsDestinationMap.entrySet ()) {
            Collections.sort (entry.getValue ());
        }
        
        
        //3. Try to find the an itinerary
        result.add ("JFK");
        if (findItineraryHelper ("JFK", departureVsDestinationMap, tickets.size () + 1, result)) {
            return result;
        }
        
        return new ArrayList<> ();
    }
    
    public boolean findItineraryHelper (String currentCity,
                                        Map<String, List<String>> departureVsDestinationMap,
                                        int totalLen,
                                        List<String> result) {
        if (result.size () == totalLen) {
            return true;
        }
        
        // cannot find the departure in the map, return false immediately
        if (!departureVsDestinationMap.containsKey (currentCity)) {
            return false;
        }
        
        
        List<String> dests = departureVsDestinationMap.getOrDefault (currentCity, new ArrayList<String> ());
        
        //System.out.println (Arrays.toString (dests.toArray()));
        for (int i = 0; i < dests.size (); i++) {
            String dest = dests.get (i);
            
            //System.out.println (dest);
            
            result.add (dest);
            dests.remove (i);
            //departureVsDestinationMap.put (currentCity, dests);
            
            if (findItineraryHelper (dest, departureVsDestinationMap, totalLen, result)) {
                return true;
            }
            
            result.remove (result.size () - 1);
            dests.add (i, dest);
            //departureVsDestinationMap.put (currentCity, dests);
        }
        
        return false;
    }
}