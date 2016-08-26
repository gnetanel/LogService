// ILogService.aidl
package com.netanel.logservice;
import com.netanel.logservice.Message;


interface ILogService { //
    void log_d(String tag, String message);
    void log(in Message msg);
}