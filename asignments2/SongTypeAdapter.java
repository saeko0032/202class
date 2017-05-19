package test.file1;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class SongTypeAdapter extends TypeAdapter {

	@Override
	public Song read(final JsonReader in) throws IOException {

		final Song song = new Song(null, null, null, 0, false);

		in.beginObject();
		while(in.hasNext()) {
			switch(in.nextName()) {
			case "songTitle":
				song.setSongTitle(in.nextString());
				break;
			case "songArtist":
				song.setSongArtist(in.nextString());
				break;
			case "genre":
				song.setGenre(in.nextString());
				break;
			case "songPrice":
				song.setSongPrice(in.nextDouble());
				break;
			case "isPurchase":
				song.setIsPurchase(in.nextBoolean());
				break;
			}
		}
		in.endObject();
		return song;
	}

	@Override
	public void write(JsonWriter arg0, Object arg1) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
