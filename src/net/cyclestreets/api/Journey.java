package net.cyclestreets.api;

import java.util.ArrayList;
import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(strict=false)
public class Journey 
{
	public String plan() { return markers.get(0).plan; }
	
	@ElementList(inline=true, entry="marker", required=false)
	public List<Marker> markers = new ArrayList<Marker>();		// default to empty list
}
