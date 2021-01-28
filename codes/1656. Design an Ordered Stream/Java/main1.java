class OrderedStream {

	private int len;
	private int ptr;
	private String[] str;

	public OrderedStream(int n) {
		str = new String[n];
		ptr = 1;
		len = n;
	}
    
    public List<String> insert(int id, String value) {
    	int index = id - 1;
		str[index] = value;
		List<String> list = new ArrayList<>();
		if (id == ptr) {
			while (index<len && str[index]!=null) {
				list.add(str[index]);
				index++;
			}
			ptr = index + 1;
			return list;
		}
		return Collections.EMPTY_LIST;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(id,value);
 */