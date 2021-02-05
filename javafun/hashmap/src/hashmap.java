import java.util.HashMap;
import java.util.Set;

public class hashmap {

	public void songsList() {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Song 1", "Lyrics of song 1");
		trackList.put("Song 2", "Lyrics of song 2");
		trackList.put("Song 3", "Lyrics of song 3");
		trackList.put("Song 4", "Lyrics of song 4");
		
		String getSong = trackList.get("Song 1");
		System.out.println(getSong);
		
		Set<String> keys = trackList.keySet();
		for(String key : keys) {
			System.out.println(key+": "+trackList.get(key));
		}
	}
}
