package id.example.mvp.core.di.module

import dagger.Module
import dagger.Provides
import id.example.mvp.core.data.remote.ServiceApi
import javax.inject.Singleton
import retrofit2.Retrofit

/**
 * Created by hahn on 21.06.19.
 * Project: BaseKotlinMvp
 *
 * Module for network API
 */

@Module(includes = [NetworkModule::class])
class ApiModule {

    @Provides
    @Singleton
    internal fun provideServiceApi(retrofit: Retrofit): ServiceApi = retrofit.create(ServiceApi::class.java)
}
