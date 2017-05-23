package test.file1;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class CDTypeAdapter  extends TypeAdapter{

	private ArrayList<Song> songList;

	@Override
	public CD read(final JsonReader in) throws IOException {
		final CD cd = new CD(null, null, null, 0, false, 0, songList);
		in.beginObject();
		while(in.hasNext()) {
	         String name = in.nextName();
			switch(name) {
			case "albumTitle":
				cd.setAlbumTitle(in.nextString());
				break;
			case "albumArtist":
				cd.setAlbumArtist(in.nextString());
				break;
			case "numberOfTrucks":
				cd.setNumberOfTrucks(in.nextInt());
				break;
			case "numberOfDiscs":
				cd.setNumberOfDiscs(in.nextInt());
				break;
			case "albumGenre":
				cd.setAlbumGenre(in.nextString());
				break;
			case "isPurchase":
				cd.setIsPurchase(in.nextBoolean());
				break;
			case "costOfCD":
				cd.setCostOfCD(in.nextDouble());
				break;
			case "songList":
				songList = new ArrayList<>();
				in.beginArray();
				while(in.hasNext()) {
					SongTypeAdapter songTA = new SongTypeAdapter();
					songList.add(songTA.read(in));
					cd.setSongList(songList);
				}
				in.endArray();
				break;

			}
		}
		
		return cd;
	}

	@Override
	public void write(JsonWriter arg0, Object arg1) throws IOException {
		// do not need to write it now
		
	}
	

}
