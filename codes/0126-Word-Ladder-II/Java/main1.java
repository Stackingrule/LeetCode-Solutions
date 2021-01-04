class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<List<String>>();
        Set<String> dictionary =  new HashSet<String>(wordList);
        if(!dictionary.contains(endWord)) return result;
        bfs(beginWord, endWord, dictionary, result);
        return result;
    }
    private void bfs(String beginWord, String endWord, Set<String> wordList, List<List<String>> result){
        Set<String> preWord = new HashSet<String>();
        preWord.add(beginWord);
        Queue<List<String>> prePaths = new LinkedList<List<String>>();
        List<String> begin = new ArrayList<String>();
        begin.add(beginWord);
        prePaths.offer(begin);
        boolean find = false;
        while(!prePaths.isEmpty()){
            Set<String> peerWord = new HashSet<String>();
            int size = prePaths.size();
            for(int i = 0; i < size; i++){
                List<String> path = prePaths.poll();
                String lastWord = path.get(path.size() - 1); // the last word of the path
                List<String> branch = transform(lastWord, wordList);
                for(String word : branch){
                    if(preWord.contains(word)) continue; // pruning
                    path.add(word);
                    prePaths.offer(new ArrayList<String>(path));
                    peerWord.add(word);
                    if(word.equals(endWord)){
                        find = true;
                        result.add(new ArrayList<String>(path));
                        break; // pruning
                    }
                    path.remove(path.size() - 1);
                }
            }
            preWord.addAll(peerWord);
            if(find){
                break; // finish search
            }
        }
    }
    // all transformed word
    private List<String> transform(String word, Set<String> wordList){
        List<String> nextWord = new ArrayList<String>();
        char[] s = word.toCharArray();
        for(int i = 0; i < s.length; i++){
            for(char c = 'a'; c <= 'z'; c++){
                if(s[i] == c) continue;
                char oldch = s[i];
                s[i] = c;
                if(wordList.contains(String.valueOf(s))){
                    nextWord.add(String.valueOf(s));
                }
                s[i] = oldch;
            }
        }
        return nextWord;
    }
    
}