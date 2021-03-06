/*
 * Copyright (c) Francisco Barroso
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.fb.splitscreenlauncher.di

import com.fb.splitscreenlauncher.service.ServiceController
import com.fb.splitscreenlauncher.service.ServiceControllerImpl
import org.koin.dsl.module


val moduleService = module {

    single { ServiceControllerImpl(get()) as ServiceController }


}

val moduleServiceTest = module {

    single { ServiceControllerImpl(get()) }

}