## Singleton implementations tests using Multiple Threads.

### below outputs while running main class demonstrates the success or failure of the Singleton implementaion on each run.

ThreadSafeSingleton(TSafeSingleton) :

run01 :\
T2 inside getInstance()\
T2 inside null check\
T2 created instance\
T1 inside getInstance()

run02 :\
T2 inside getInstance()\
T1 inside getInstance()\
T1 inside null check\
T2 inside null check\
T2 created instance\
T1 created instance

Note: TSafeSingleton is not Thread Safe


SynchronizedSingleton(SyncSingleton) :

run01 :\
T2 inside getInstance()\
T1 inside getInstance()\
T2 inside null check\
T1 inside null check\
T2 inside synchronized block\
T1 inside synchronized block

run10 :\
T2 inside getInstance()\
T2 inside null check\
T2 inside synchronized block\
T1 inside getInstance()

Note: TSafeSingleton is not Thread Safe


