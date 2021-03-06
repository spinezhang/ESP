/*
 * ESP Copyright (C) 2013 - 2014 Burton Alexander
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 * 
 */
package com.github.mrstampy.esp.dsp.lab;

// TODO: Auto-generated Javadoc
/**
 * The Interface Lab.
 */
public interface Lab extends LabValues {

	/**
	 * Implementations will call {@link #process(double[][])} with the
	 * {@link RawEspConnection#getCurrent()} signal.
	 */
	void triggerProcessing();

	/**
	 * Implementations will call {@link #process(double[][])} with the
	 * {@link RawEspConnection#getCurrent(int)} signal.
	 *
	 * @param numSamples the num samples
	 */
	void triggerProcessing(int numSamples);

	/**
	 * Process.
	 *
	 * @param signal
	 *          the signal
	 */
	void process(double[][] signal);

	/**
	 * Stop calculate baseline.
	 */
	void stopCalculateBaseline();

	/**
	 * Calculate baseline.
	 */
	void calculateBaseline();

	/**
	 * Reset baseline.
	 */
	void resetBaseline();

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	RawEspConnection getConnection();

	/**
	 * Sets the connection.
	 *
	 * @param connection
	 *          the new connection
	 */
	void setConnection(RawEspConnection connection);

	/**
	 * Returns a serializable {@link LabValues} object for lab values persistence.
	 *
	 * @return the lab values
	 */
	LabValues getLabValues();

	/**
	 * Initialization of a lab with values.
	 *
	 * @param values
	 *          the new lab values
	 */
	void setLabValues(LabValues values);

	/**
	 * Adds the signal processed listener.
	 *
	 * @param l
	 *          the l
	 */
	void addSignalProcessedListener(SignalProcessedListener l);

	/**
	 * Removes the signal processed listener.
	 *
	 * @param l
	 *          the l
	 */
	void removeSignalProcessedListener(SignalProcessedListener l);

	/**
	 * Clear signal processed listeners.
	 */
	void clearSignalProcessedListeners();

}