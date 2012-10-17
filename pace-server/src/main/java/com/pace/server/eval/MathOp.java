/**
 * 
 */
package com.pace.server.eval;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.commons.math3.stat.clustering.Cluster;
import org.apache.commons.math3.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cern.colt.matrix.DoubleMatrix2D;

/**
 * @author jim
 *
 */
public class MathOp {
	public List<Cluster<EuclideanIntegerPoint>> clusterData(DoubleMatrix2D dataMatrix) {
		
		        KMeansPlusPlusClusterer<EuclideanIntegerPoint> transformer =
		            new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(new Random(1746432956321l));
		        EuclideanIntegerPoint[] points = new EuclideanIntegerPoint[] {

		                // first expected cluster
		                new EuclideanIntegerPoint(new int[] { -15,  3 }),
		                new EuclideanIntegerPoint(new int[] { -15,  4 }),
		                new EuclideanIntegerPoint(new int[] { -15,  5 }),
		                new EuclideanIntegerPoint(new int[] { -14,  3 }),
		                new EuclideanIntegerPoint(new int[] { -14,  5 }),
		                new EuclideanIntegerPoint(new int[] { -13,  3 }),
		                new EuclideanIntegerPoint(new int[] { -13,  4 }),
		                new EuclideanIntegerPoint(new int[] { -13,  5 }),

		                // second expected cluster
		                new EuclideanIntegerPoint(new int[] { -1,  0 }),
		                new EuclideanIntegerPoint(new int[] { -1, -1 }),
		                new EuclideanIntegerPoint(new int[] {  0, -1 }),
		                new EuclideanIntegerPoint(new int[] {  1, -1 }),
		                new EuclideanIntegerPoint(new int[] {  1, -2 }),

		                // third expected cluster
		                new EuclideanIntegerPoint(new int[] { 13,  3 }),
		                new EuclideanIntegerPoint(new int[] { 13,  4 }),
		                new EuclideanIntegerPoint(new int[] { 14,  4 }),
		                new EuclideanIntegerPoint(new int[] { 14,  7 }),
		                new EuclideanIntegerPoint(new int[] { 16,  5 }),
		                new EuclideanIntegerPoint(new int[] { 16,  6 }),
		                new EuclideanIntegerPoint(new int[] { 17,  4 }),
		                new EuclideanIntegerPoint(new int[] { 17,  7 })

		        };
		        List<Cluster<EuclideanIntegerPoint>> clusters =
		            transformer.cluster(Arrays.asList(points), 3, 10);

		        assertEquals(3, clusters.size());
		        boolean cluster1Found = false;
		        boolean cluster2Found = false;
		        boolean cluster3Found = false;
		        for (Cluster<EuclideanIntegerPoint> cluster : clusters) {
		            int[] center = cluster.getCenter().getPoint();
		            if (center[0] < 0) {
		                cluster1Found = true;
		                assertEquals(8, cluster.getPoints().size());
		                assertEquals(-14, center[0]);
		                assertEquals( 4, center[1]);
		            } else if (center[1] < 0) {
		                cluster2Found = true;
		                assertEquals(5, cluster.getPoints().size());
		                assertEquals( 0, center[0]);
		                assertEquals(-1, center[1]);
		            } else {
		                cluster3Found = true;
		                assertEquals(8, cluster.getPoints().size());
		                assertEquals(15, center[0]);
		                assertEquals(5, center[1]);
		            }
		        }

		return clusters;
	}

}
