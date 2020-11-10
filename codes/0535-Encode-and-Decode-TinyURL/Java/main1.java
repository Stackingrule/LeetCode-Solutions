public class Codec {
    private Map<Integer, String> idToLong = new HashMap<>();
    private int id = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        idToLong.put(id, longUrl);
        return "http://tinyurl.com/" + id++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int id = Integer.parseInt(shortUrl.replace("http://tinyurl.com/", ""));
        return idToLong.get(id);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));