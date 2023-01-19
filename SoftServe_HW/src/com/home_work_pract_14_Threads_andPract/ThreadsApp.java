package com.home_work_pract_14_Threads_andPract;

public class ThreadsApp
{

	public static final String str = new String(); 

	public static void main(String[] args)
	{
		MyThread_1 myth_1 = new MyThread_1();
		MyThread_2 myth_2 = new MyThread_2();
		MyThread_3 myth_3 = new MyThread_3();
		MyThread_4 myth_4 = new MyThread_4();
		MyThread_5 myth_5 = new MyThread_5();
		MyThread_6 myth_6 = new MyThread_6();
		MyThread_7 myth_7 = new MyThread_7();
		MyThread_10 myth_10 = new MyThread_10();


		Thread th_1 = new Thread(myth_1);
		Thread th_2 = new Thread(myth_2);
		Thread th_3 = new Thread(myth_3);
		Thread th_4 = new Thread(myth_4);
		Thread th_5 = new Thread(myth_5);
		Thread th_6 = new Thread(myth_6);
		Thread th_7 = new Thread(myth_7);
		Thread th_10 = new Thread(myth_10);


		try
		{
			th_1.start();
			th_1.join();
			th_2.start();
			th_2.join();
			th_10.start();
			th_10.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("My name is Oleksii");

//home_work_task_1

				try
				{
					th_3.start();
					th_4.start();
					th_4.join();
					th_5.start();
					th_5.join();
				}
				catch (InterruptedException e1)
				{
					e1.printStackTrace();
				}

//home_work_task_2

			th_6.start();
			while(th_6.isAlive())
			{
				try
				{
					Thread.sleep(1000);
				}catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.println("while");
			}

//home_work_task_3

		th_7.start();

	}

}

//pract_1
class MyThread_1 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("I study Java.");
		}
	}
}
//pract_2
class MyThread_2 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep(2000);
				System.out.println("Hello, world.");
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class MyThread_10 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep(3000);
				System.out.println("Peace in the peace.");
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class MyThread_3 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Run MyThread_3.\t\t count: " + (i+1));
		}
	}
}
class MyThread_4 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Run MyThread_4.\t\t count:" + (i+1));
		}
	}
}
class MyThread_5 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Run MyThread_5.\t\t count:" + (i+1));
		}
	}
}
class MyThread_6 implements Runnable
{
	public void run()
	{
			while(Thread.currentThread().isAlive())
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
	}
}
class MyThread_7 implements Runnable
{
	@Override
	public void run()
	{
		MyThread_8 myth_8 = new MyThread_8();
		MyThread_9 myth_9 = new MyThread_9();
		Thread th_8 = new Thread(myth_8, "Thread#2");
		Thread th_9 = new Thread(myth_9, "Thread#3");

		try
		{
			th_8.start();
			th_8.join();
			th_9.start();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

	}
}
class MyThread_8 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 3; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Thread number two.\t\t count:" + (i+1));
		}
	}
}
class MyThread_9 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Thread number three.\t\t count:" + (i+1));
		}
	}
}