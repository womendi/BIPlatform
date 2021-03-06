/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.rigel.biplatform.ma.common.file.protocol;

/**
 * 
 * 请求指令
 *
 * @author david.wang
 * @version 1.0.0.1
 */
public enum Command {
    
    /**
     * 请求文件上属性
     */
    FILE_ATTRIBUTES,
    
    /**
     * 删除文件
     */
    RM,
    
    /**
     * 创建目录
     */
    MKDIR,
    
    /**
     * 创建多级目录
     */
    MKDIRS,
    
    /**
     * 写文件
     */
    WRITE,
    
    /**
     * 移动文件
     */
    MV,
    
    /**
     * 复制文件
     */
    COPY,
    
    /**
     * 查看文件列表
     */
    LS,
    
    /**
     * READ
     */
    READ
    
}
