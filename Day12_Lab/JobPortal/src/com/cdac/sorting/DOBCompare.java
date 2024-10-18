package com.cdac.sorting;

import java.util.Comparator;

import com.cdac.classes.JobSeeker;

public class DOBCompare implements Comparator<JobSeeker> {

	@Override
	public int compare(JobSeeker o1, JobSeeker o2) {
		// TODO Auto-generated method stub
		return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
	}


}
