/**
 * 
 */
package com.pace.base.mdb;

import java.util.List;

import com.pace.base.data.Intersection;

/**
 * @author Alan Farkas
 *
 * Index to a logical block of data in the data cache. All data blocks
 * have the same dimensionality.
 */
public class PafDataBlockIndex {
	Intersection blockIndex = null;
	List<Intersection> aliasBlockIndex = null;
	Intersection baseIndex = null;
}
