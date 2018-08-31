package net.porillo.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.Location;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tree {

	//TODO: Add JavaDocs
	private Integer uniqueID;
	private GPlayer owner;
	private Location location;
	private boolean isSapling;
	private Integer size;

}
