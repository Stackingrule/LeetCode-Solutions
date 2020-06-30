class Solution {
public:
    bool verifyPostorder(vector<int>& postorder) {
    	return checkTree(postorder, 0, postorder.size() - 1);
    }

    bool checkTree(vector<int> postorder, int start, int end) {
    	if (start >= end) {
    		return true;
    	}

    	int root = postorder[end];
    	int leftStart = start;
    	int leftEnd = leftStart;

    	while (leftStart < end && postorder[leftEnd] < root) {
    		leftEnd++;
    	}
    	leftEnd--;

    	int rightStart = leftEnd + 1;
    	int rightEnd = end - 1;
    	for (int i = rightStart; i < end; ++i) {
    		if (postorder[i] > root) {
    			continue;
    		}
    		return false;
    	}

    	return checkTree(postorder, leftStart, leftEnd) && checkTree(postorder, rightStart, rightEnd);
    }
};