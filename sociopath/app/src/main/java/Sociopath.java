import java.util.ArrayList;
import java.util.List;


public class Sociopath {

	public int findTheSociopath (int groupSize, List<int []> likeList) {
		if (groupSize <= 0) {
			return -1;
		}
		ArrayList<Integer>[] likedBy = new ArrayList[groupSize];
		for (int i = 0; i < groupSize; i++) {
			likedBy[i] = new ArrayList<>();
		}
		for (int[] pair : likeList) {
			if (pair[0] < 1 || pair[0] > groupSize || pair[1] < 1 || pair[1] > groupSize) {
				return -1;
			}
			int index = pair[1] - 1;
			if (!(likedBy[index].contains(pair[0]))) {
				likedBy[index].add(pair[0]);
			}
		}


		for (int i = 0; i < groupSize; i++) {
			if (likedBy[i].size() == (groupSize - 1)) {
				int likes = 0;
				for (int j = 0; j < groupSize; j++) {
					if (likedBy[j].contains((i+1)) && i != j) {
						likes++;
					}
				}
				if (likes == 0) {
					return (i + 1);
				}
			}
		}
		return -1;

	}
}
