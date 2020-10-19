    public boolean canCross(int[] stones) {
        Map<Integer, Integer> posIndexMap = new HashMap<>();
        // get PosIndexMap
        for (int i = 0; i < stones.length; i++) {
            posIndexMap.put(stones[i], i);
        }
        
        List<Set<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            dp.add(new HashSet<>());
        }
        dp.get(0).add(1);
        for (int i = 0; i < stones.length; i++) {
            Set<Integer> speedOptions = dp.get(i);
            if (speedOptions.size() == 0) continue;
            int curPos = stones[i];
            for (int speed : speedOptions) {
                if (posIndexMap.containsKey(curPos + speed)) {
                    int nextIndex = posIndexMap.get(curPos + speed);
                    if (curPos + speed == stones[stones.length - 1]) return true;
                    dp.get(nextIndex).add(speed);
                    dp.get(nextIndex).add(speed + 1);
                    if (speed > 1) dp.get(nextIndex).add(speed - 1);
                }
            }
        }
        return false;
    }