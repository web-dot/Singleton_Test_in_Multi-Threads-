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

run11 :\
T1 inside getInstance()\
T1 inside null check\
T1 inside synchronized block\
T2 inside getInstance()

run13 :\
T1 inside getInstance()\
T2 inside getInstance()\
T1 inside null check\
T2 inside null check\
T1 inside synchronized block\
T1 creates instance\
T2 inside synchronized block\
T2 creates instance

run18 :\
T2 inside getInstance()\
T2 inside null check\
T2 inside synchronized block\
T2 creates instance\
T1 inside getInstance()

Note: SyncSingleton is not Thread Safe


The siplest solution would be to synchronize the getInstance() method. But this would affect the\
performance of the pgm if the Singleton is called frequently.\

Solution :\
To resolve this problem is to have a second verification inside the synchronized block\
using a idiom called  Double-Checked Locking.

DoubleCheckedSingleton :\

run10 :\
T2 inside getInstance()\
T1 inside getInstance()\
T2 inside first null check\
T1 inside first null check\
T2 inside synchronized block\
T2 inside second null check\
T2 created INSTANCE\
T2 out of getInstance() method\
T1 inside synchronized block\
T1 out of getInstance() method

run11 :\
T1 inside getInstance()\
T2 inside getInstance()\
T1 inside first null check\
T2 inside first null check\
T1 inside synchronized block\
T1 inside second null check\
T1 created INSTANCE\
T1 out of getInstance() method\
T2 inside synchronized block\
T2 out of getInstance() method

run17 :\
T2 inside getInstance()
T2 inside first null check
T2 inside synchronized block
T2 inside second null check
T2 created INSTANCE
T2 out of getInstance() method
T1 inside getInstance()
T1 out of getInstance() method


@settings {
  font-size: 25;
}
