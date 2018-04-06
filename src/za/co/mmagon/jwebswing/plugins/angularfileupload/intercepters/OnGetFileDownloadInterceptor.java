package za.co.mmagon.jwebswing.plugins.angularfileupload.intercepters;

import java.io.InputStream;

import za.co.mmagon.guiceinjection.Pair;

/**
 * Specifies the get file interceptor
 */
@FunctionalInterface
public interface OnGetFileDownloadInterceptor {

	/**
	 * Returns the stream for the the output filename
	 *
	 * @param filename
	 * @return
	 */
	Pair<String, InputStream> onGetFileDownload(String filename);
}