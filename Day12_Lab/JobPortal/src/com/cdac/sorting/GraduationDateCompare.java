package com.cdac.sorting;

import java.util.Comparator;

import com.cdac.classes.JobSeeker;

public class GraduationDateCompare implements Comparator<JobSeeker> {

	@Override
	public int compare(JobSeeker o1, JobSeeker o2) {
		// TODO Auto-generated method stub
		return o1.getGraduationDate().compareTo(o2.getGraduationDate());
	}

}
