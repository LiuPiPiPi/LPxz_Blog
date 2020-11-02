package top.naccl.service;

import top.naccl.entity.ScheduleJob;
import top.naccl.entity.ScheduleJobLog;

import java.util.List;

public interface ScheduleJobService {
	List<ScheduleJob> getJobList();

	ScheduleJob getJobById(Long jobId);

	void saveJob(ScheduleJob scheduleJob);

	void updateJob(ScheduleJob scheduleJob);

	void deleteJobById(Long jobId);

	void runJobById(Long jobId);

	void updateJobStatusById(Long jobId, Boolean status);

	ScheduleJobLog getJobLogById(Long jobLogId);

	void saveLog(ScheduleJobLog log);

	List<ScheduleJobLog> getJobLogList();
}
